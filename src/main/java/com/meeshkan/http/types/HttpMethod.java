package com.meeshkan.http.types;

/**
 * HTTP request methods to indicate the desired action to be performed for a given resource.
 *
 * @see HttpRequest#getMethod()
 */
public enum HttpMethod {
    /**
     * The CONNECT method establishes a tunnel to the server identified by the target resource.
     */
    CONNECT,
    /**
     * The DELETE method deletes the specified resource.
     */
    DELETE,
    /**
     * The GET method requests a representation of the specified resource. Requests using GET should only retrieve data.
     */
    GET,
    /**
     * The HEAD method asks for a response identical to that of a GET request, but without the response body.
     */
    HEAD,
    /**
     * The OPTIONS method is used to describe the communication options for the target resource.
     */
    OPTIONS,
    /**
     * The PATCH method is used to apply partial modifications to a resource.
     */
    PATCH,
    /**
     * The POST method is used to submit an entity to the specified resource, often causing a change in state or side effects on the server.
     */
    POST,
    /**
     * The PUT method replaces all current representations of the target resource with the request payload.
     */
    PUT,
    /**
     * The TRACE method performs a message loop-back test along the path to the target resource.
     */
    TRACE
}
