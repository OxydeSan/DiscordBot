import javax.security.auth.login.LoginException;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.exceptions.RateLimitedException;
import net.dv8tion.jda.core.hooks.ListenerAdapter;


public class CallBot extends ListenerAdapter{

	private JDA jda;
	
	public CallBot() throws LoginException, IllegalArgumentException, InterruptedException, RateLimitedException {
		jda = new JDABuilder(AccountType.BOT).setToken("MjQxMTk1NzY2MDMzNDE2MTkz.DDPmfQ.VN47dfJnm-jjX1cMiqAS49Bl-iQ").buildBlocking();
		jda.addEventListener(new Message(this));
	}
	
	public JDA getJDA () {
		return this.jda;
	}
}
