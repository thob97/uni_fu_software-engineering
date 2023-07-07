package task_2n;

public class AppInstance {
	int userID;
	Scan_Interface scanI;
	DecodeData_Interface decodeI;
	
	public AppInstance(int userID, Scan_Interface scanI, DecodeData_Interface decodeI) {
		this.userID = userID;
		this.scanI = scanI;
		this.decodeI = decodeI;
	}
	
	public void loadData(String selected) {
		byte[] data = scanI.scan();
		data = decodeI.decodeData(data);
		//maybe some further calculation with data//
		}
}
