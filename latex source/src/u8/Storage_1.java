package u8;

public class Storage {
	private Filesystem filesystem;
	
	public Storage(Filesystem filesystem) {
		this.filesystem = filesystem;
	}
	
	public void store(String filename, String content_str) {
		filesystem.remove(filename);
		filesystem.touch(filename);
		int sector = filesystem.position(filename);
		byte[] content = content_str.getBytes();
		filesystem.write(sector, content);
	}
}
