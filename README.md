# SS_Protocol

For basic functionality the protocol functions defined in Connect4Client and Connect4Server should all be implemented.

The other interfaces include commands for the various extension we discussed.

The commands should follow the following form:
[Method name all in uppercase minus the cmd] [arg1] [arg2] [arg3] …
Do not include the square brackets.
The arguments should follow the same order as the parameters of the method in the interface.

Example:

	public void cmdHello(String username, int clientCapabilities, boolean isAI);

The command will be for example:

	String cmd = “HELLO myUserName 7 false”;
