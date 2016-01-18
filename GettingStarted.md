# Introduction to the rql4j API #

Here will find a short howto use the rql4j api. For more examples take a look into the [Test Classes](http://code.google.com/p/rql4j/source/browse/#svn%2Ftrunk%2Fsrc%2Ftest%2Fjava%2Frql4j%2Fbuilder).


# Short HowTo #
## Initialisation ##
```
CmsServer server = new CmsServer("http://your-otms/cms/webservice/rdcmsxmlserver.wsdl");
RemoteCallWorker worker = new RemoteCallWorker(server);
RqlCommand command = new RqlCommand(worker);
```
### Logon to the Server ###
```
AdministrationBuilder loginBuilder = new AdministrationBuilder.Login("your-user", "your-password").build();
String loginGuid = command.getResult(loginBuilder).getLogin().getGuid();
```
### Logon to a Project ###
```
AdministrationBuilder validateBuilder = new AdministrationBuilder.Validate("your-project-guid").build();
command.getResult(validateBuilder);
```