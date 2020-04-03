import grpc
from concurrent import futures
import time

#import generated classes
import heating_pb2
import heating_pb2_grpc

class HeatingServer(heating_pb2_grpc.HeatingServiceServicer):
    
    currentTemp = 40
    
    #Return heating to client
    def getCurrentHeatingTemp(self, request, context):
        response = heating_pb2.IntResponse()
        response.value = self.currentTemp
        return response
    
    

    # create a gRPC server
server = grpc.server(futures.ThreadPoolExecutor(max_workers=10))

# use the generated function `add_CalculatorServicer_to_server`
# to add the defined class to the server
heating_pb2_grpc.add_HeatingServiceServicer_to_server(HeatingServer(), server)

# listen on port 50051
print('Starting server. Listening on port 50051.')
server.add_insecure_port('[::]:50051')
server.start()

# since server.start() will not block,
# a sleep-loop is added to keep alive
try:
    while True:
        time.sleep(86400)
except KeyboardInterrupt:
    server.stop(0)
        