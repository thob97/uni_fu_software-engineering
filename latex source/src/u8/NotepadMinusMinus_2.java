package u8;

public class NotepadMinusMinus {
	/* ... */
	IStorage storage;
	
	public void save() {
		String content = DocBuffer.getContent();
		String name = DocManager.getCurrentFilename();
		

		setStorage(new Storage(new Filesystem()));
		//or
		setStorage(new StorageDropbox(new DbxClient()));
		storage.store(name, content);
	}
	
	public void setStorage(IStorage s) {
		this.storage = s;
	}
}
