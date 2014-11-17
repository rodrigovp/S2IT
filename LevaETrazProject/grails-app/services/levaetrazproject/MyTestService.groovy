package levaetrazproject

import javax.jws.WebMethod
import javax.jws.WebParam
import javax.jws.WebResult
import javax.jws.WebService

/**
 * Creates a Web Service with JAX-WS Annotations
 *
 */
@WebService(name = "teste", targetNamespace = "teste", serviceName = "teste")
class MyTestService {

  // Using Plugin cxf
  static expose = ['cxfjax']

  /**
   * Web Service Operation
   *
   * @param firstName String
   * @param lastName String
   * @return message String
   */
  @WebResult(name = "loginResult")
  @WebMethod(operationName = "login")
  String login(@WebParam(name = "firstname") String firstName, @WebParam(name = "lastname") String lastName) {
    return "Hello " + firstName + " " + lastName
  }
}