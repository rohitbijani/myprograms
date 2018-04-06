package com.bridgelabz.DesignPattern;

public class ProxyCommandExecutor implements CommandExecutor {
	
	private boolean isAdmin;
	private CommandExecutorImpl executor;

	public ProxyCommandExecutor(String user, String pass) {

		if(user.equals("abc") && pass.equals("123"))
		{
			isAdmin = true;		
		}
		
		executor = new CommandExecutorImpl();
	}
	
	@Override
	public void runCommand(String cmd) throws Exception {
	
		if(isAdmin)
		{
			executor.runCommand(cmd);
		}
		else
		{
			if(cmd.trim().startsWith("rm"))
			{
				throw new Exception("rm command is not allowed for non-admin users.");
			}
			else
			{
				executor.runCommand(cmd);
			}
		}
	}
}
