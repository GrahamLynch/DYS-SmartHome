# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
import grpc

import heating_pb2 as heating__pb2


class HeatingServiceStub(object):
  # missing associated documentation comment in .proto file
  pass

  def __init__(self, channel):
    """Constructor.

    Args:
      channel: A grpc.Channel.
    """
    self.setHeatingTemp = channel.unary_unary(
        '/heating.HeatingService/setHeatingTemp',
        request_serializer=heating__pb2.IntRequest.SerializeToString,
        response_deserializer=heating__pb2.StringResponse.FromString,
        )
    self.getCurrentHeatingTemp = channel.unary_unary(
        '/heating.HeatingService/getCurrentHeatingTemp',
        request_serializer=heating__pb2.Empty.SerializeToString,
        response_deserializer=heating__pb2.IntResponse.FromString,
        )


class HeatingServiceServicer(object):
  # missing associated documentation comment in .proto file
  pass

  def setHeatingTemp(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def getCurrentHeatingTemp(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')


def add_HeatingServiceServicer_to_server(servicer, server):
  rpc_method_handlers = {
      'setHeatingTemp': grpc.unary_unary_rpc_method_handler(
          servicer.setHeatingTemp,
          request_deserializer=heating__pb2.IntRequest.FromString,
          response_serializer=heating__pb2.StringResponse.SerializeToString,
      ),
      'getCurrentHeatingTemp': grpc.unary_unary_rpc_method_handler(
          servicer.getCurrentHeatingTemp,
          request_deserializer=heating__pb2.Empty.FromString,
          response_serializer=heating__pb2.IntResponse.SerializeToString,
      ),
  }
  generic_handler = grpc.method_handlers_generic_handler(
      'heating.HeatingService', rpc_method_handlers)
  server.add_generic_rpc_handlers((generic_handler,))
