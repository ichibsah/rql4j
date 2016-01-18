This project aims to provide an API for interacting with the Open Text Web Site Management Server (formerly known as RedDot CMS) in Java. It is limited in scope by the underlying RQL interface from Open Text, but is capable of the following:

  * Remote control via SOAP
  * High objective context with value holders and xml data binding
  * Dynamic building of RQLs with builder pattern support
  * RQLs execution are managed by controller pattern, so you have access to every past RQL result

This library uses the Apache Axis 1.4 library to communicate with the Management Server via the SOAP specification. This requires that your Management Server installation has been done with SOAP Support enabled. There are also plans to eventually support remote calls over a native http interface in the near future as well.

This project is built via Apache Maven, meaning that if you add it as a dependency to another Maven project, its dependencies will be managed automatically for you. For example, Maven will download the relevant Castor and Apache Axis libraries for you.
Currently this API is targeted for Open Text Web Site Management Server versions 7.5 and newer.