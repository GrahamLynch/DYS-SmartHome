import grpc
from concurrent import futures
import time

#import generated classes
import heating_pb2
import heating_pb2_grpc

class HeatingServer(heating_pb2_grpc.HeatingServiceServicer):
    
    currentTemp = 40
    maxTemp = 100
    minTemp = 0
   
    
   
    def getCurrentHeatingTemp(self, request, context):
        response = heating_pb2.IntResponse()
        response.value = self.currentTemp
        return response
    
    def setHeatingTemp(self, request, context):
       
        response = heating_pb2.StringResponse()
        if self.minTemp > request.value:
            print("Temperature too low")
        elif self.maxTemp < request.value:
            print("Temperature too high")
        else:
            print("Temperature updated to " + str(request.value))
        return response
    
    


server = grpc.server(futures.ThreadPoolExecutor(max_workers=10))


heating_pb2_grpc.add_HeatingServiceServicer_to_server(HeatingServer(), server)


print('Starting server. Listening on port 50051.')
server.add_insecure_port('[::]:50051')
server.start()


try:
    while True:
        time.sleep(86400)
except KeyboardInterrupt:
    server.stop(0)
        