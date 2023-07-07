package u8;

public class NotepadMinusMinus {
	/* ... */
	
	public void save() {
		String content = DocBuffer.getContent();
		String name = DocManager.getCurrentFilename();
		
		Filesystem filesystem = new Filesystem();
		Storage storage = new Storage(filesystem);
		storage.store(name, content);
	}
}
