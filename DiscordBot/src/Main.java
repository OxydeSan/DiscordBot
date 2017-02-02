import javax.security.auth.login.LoginException;

import net.dv8tion.jda.JDA;
import net.dv8tion.jda.JDABuilder;

public class Main {
	

	public static void main(String[] args) {
		JDA jda = null;
		try {
			jda = new JDABuilder().setBotToken("MjQxMTk1NzY2MDMzNDE2MTkz.CvOgBA.-dscbyowEt0WhJTV3dgikmq2x8Q").buildBlocking();
		} catch (LoginException | IllegalArgumentException
				| InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		jda.addEventListener(new Message(jda));

	}

}
