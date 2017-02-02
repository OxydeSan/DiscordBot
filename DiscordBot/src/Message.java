import java.io.File;
import java.util.Random;

import net.dv8tion.jda.JDA;
import net.dv8tion.jda.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.hooks.ListenerAdapter;


public class Message extends ListenerAdapter {
	
	private JDA jda;
	
	public Message (JDA jda)
	{
		this.jda = jda;
	}
	
	@Override
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		
		int r = new Random().nextInt(3);		
		if (event.getMessage().getContent().contains("@WinnieLOurson")) 
		{
			switch (r) 
			{
				case 0 : event.getChannel().sendMessage("Ce n'est pas parce que tu parles que tu es intelligent.");
				break;
				case 1 : event.getChannel().sendMessage("GET OFF MY YAAAARD !");
				break;
				case 2 : event.getChannel().sendMessage("Tu veux voir ma bite ?");
				break;
			}
			
		} 
		if (event.getMessage().getContent().contains("!tgWinnie"))
		{
			event.getChannel().sendMessage("La côte Ouest m'appelle, j'me casse.");
			this.jda.shutdown();
		}
		
		//System.out.println(event.getMessage().getAuthor().getUsername());
		if (event.getMessage().getAuthor().getUsername().equalsIgnoreCase("preprogrammed-messages") && event.getMessage().getContent().contains("@Sora")) {
			event.getChannel().sendMessage("Fais-moi un câlin mon petit Jeremy :heart:");
		}
		
		if (event.getMessage().getContent().contains("!selfie"))
		{
			event.getChannel().sendFile(new File(""), null);
		}
		
	}
	
}
