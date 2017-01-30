package connect4;

public interface ChatCapabilityServer {
	
	/**
	 * Sends an user-message to all capable clients, also to the client the MESSAGE command came from.
	 * @param senderId the id of the client that has sent the CHAT command
	 * @param msg the message to broadcast
	 */
	public void cmdBroadcastMessage(int senderId, String msg);

}
