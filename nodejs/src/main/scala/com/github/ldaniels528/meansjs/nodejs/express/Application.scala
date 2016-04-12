package com.github.ldaniels528.meansjs.nodejs.express

import com.github.ldaniels528.meansjs.nodejs.http.Server

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
  * The app object conventionally denotes the Express application. Create it by calling the
  * top-level express() function exported by the Express module.
  * @author lawrence.daniels@gmail.com
  * @see [[http://expressjs.com/en/api.html]]
  */
@js.native
trait Application extends Router {

  /////////////////////////////////////////////////////////////////////////////////
  //      Properties
  /////////////////////////////////////////////////////////////////////////////////

  /**
    * The app.locals object has properties that are local variables within the application.
    * @see [[http://expressjs.com/en/api.html#app.locals]]
    */
  var locals: js.Any

  /**
    * The app.mountpath property contains one or more path patterns on which a sub-app was mounted.
    * @see [[http://expressjs.com/en/api.html#app.mountpath]]
    */
  var mountpath: js.Any

  /////////////////////////////////////////////////////////////////////////////////
  //      Methods
  /////////////////////////////////////////////////////////////////////////////////

  /**
    * app.configure has been removed in Express 4.x.
    * @example app.configure(init)
    */
  @deprecated("app.configure has been removed in Express 4.x")
  def configure(init: js.Function): Unit

  /**
    * Sets the Boolean setting name to false, where name is one of the properties from the app settings table.
    * Calling app.set('foo', false) for a Boolean property is the same as calling app.disable('foo').
    * @example app.disable(name)
    */
  def disable(name: String): Unit

  /**
    * Returns true if the Boolean setting name is disabled (false), where name is one of the properties
    * from the app settings table.
    * @example app.disabled(name)
    */
  def disabled(name: String): Boolean

  /**
    * Sets the Boolean setting name to true, where name is one of the properties from the app settings table.
    * Calling app.set('foo', true) for a Boolean property is the same as calling app.enable('foo').
    * @example app.enable(name)
    */
  def enable(name: String): Unit

  /**
    * Returns true if the setting name is enabled (true), where name is one of the properties from the app settings table.
    * @example app.enabled(name)
    */
  def enabled(name: String): Boolean

  /**
    * Registers the given template engine callback as ext. By default, Express will require() the engine based on
    * the file extension. For example, if you try to render a “foo.jade” file, Express invokes the following
    * internally, and caches the require() on subsequent calls to increase performance.
    * @example app.engine(ext, callback)
    */
  def engine(name: String, callback: js.Function): Unit

  /**
    * Returns the value of name app setting, where name is one of strings in the app settings table.
    * @example app.get(name)
    */
  def get(name: String): js.UndefOr[String]

  /**
    * Binds and listens for connections on the specified host and port.
    * This method is identical to Node’s http.Server.listen().
    * @example app.listen(port, [hostname], [backlog], [callback])
    */
  def listen(port: Int, hostname: String, backlog: js.Any, callback: js.Function): Server

  def listen(port: Int, hostname: String, backlog: js.Any): Server

  def listen(port: Int, hostname: String, callback: js.Function): Server

  def listen(port: Int, hostname: String): Server

  def listen(port: Int, callback: js.Function): Server

  def listen(port: Int): Server

  def on(mount: String, callback: js.Function): Unit

  /**
    * Returns the canonical path of the app, a string.
    * @example app.path()
    */
  def path(): String

  /**
    * Returns the rendered HTML of a view via the callback function. It accepts an optional parameter
    * that is an object containing local variables for the view. It is like res.render(), except it
    * cannot send the rendered view to the client on its own.
    * @example app.render(view, [locals], callback)
    */
  def render(view: String, locals: js.Any, callback: js.Function): Unit

  /**
    * Returns an instance of a single route, which you can then use to handle HTTP verbs with
    * optional middleware. Use app.route() to avoid duplicate route names (and thus typo errors).
    * @example app.route(path)
    */
  def route(path: String): js.Any

  /**
    * Assigns setting name to value, where name is one of the properties from the app settings table.
    * Calling app.set('foo', true) for a Boolean property is the same as calling app.enable('foo').
    * Similarly, calling app.set('foo', false) for a Boolean property is the same as calling app.disable('foo').
    * Retrieve the value of a setting with app.get().
    * @example app.set(name, value)
    */
  def set(name: String, value: js.Any): Unit

  def set(headers: js.Any): Unit // TODO ????

  /**
    * Mounts the specified middleware function or functions at the specified path.
    * If path is not specified, it defaults to “/”.
    * @example app.use([path,] function [, function...])
    */
  def use(path: String, router: Router): Unit

  def use(router: Router): Unit

}

/**
  * Application Companion
  * @author lawrence.daniels@gmail.com
  */
object Application {

  @js.native
  @JSName("__dirname")
  object __dirname extends js.GlobalScope

}
