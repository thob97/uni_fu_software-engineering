package u8;

public class StorageDropbox implements IStorage{
	private DbxClient dropbox;
	
	public StorageDropbox(DbxClient dropbox) {
		this.dropbox = dropbox;
	}
	
	public void store(String filename, String content_str) {
		byte[] content = content_str.getBytes();
		if(dropbox.fileExists(filename)) {
			dropbox.uploadFile(filename, DbxClient.WriteMode.REPLACE, content);
		}
		else {
			dropbox.uploadFile(filename, DbxClient.WriteMode.ADD, content);
		}
	}
}
