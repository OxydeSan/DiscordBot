
import java.util.Random;
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;




public class Message extends ListenerAdapter {
	
	private CallBot bot;
	
	public Message (CallBot bot)
	{
		this.bot = bot;
	}
	
	@Override
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		
		
		// Message au pif quand tag
		int r = new Random().nextInt(3);		
		if (event.getMessage().getContent().contains("@WinnieLOurson")) 
		{
			switch (r) 
			{
				case 0 : event.getChannel().sendMessage("Ce n'est pas parce que tu parles que tu es intelligent.").queue();
				break;
				case 1 : event.getChannel().sendMessage("GET OFF MY YAAAARD !").queue();
				break;
				case 2 : event.getChannel().sendMessage("Tu veux voir ma bite ?").queue();
				break;
			}
			
		}
		
		// STOP
		if (event.getMessage().getContent().contains("!tgWinnie"))
		{
			event.getChannel().sendMessage("La côte Ouest m'appelle, j'me casse.").queue();
			this.bot.getJDA().shutdown();
		}
		
		
		// Dafuq
		if (event.getMessage().getAuthor().getName().equalsIgnoreCase("preprogrammed-messages") && event.getMessage().getContent().contains("@Sora")) {
			event.getChannel().sendMessage("Fais-moi un câlin mon petit Jeremy :heart:").queue();
		}
		
		
		// SELFIE
		if (event.getMessage().getContent().contains("!selfie"))
		{
				//event.getChannel().sendFile(new File(""), null);
				event.getChannel().sendMessage("test").queue();
		}
		
	}
	
}
