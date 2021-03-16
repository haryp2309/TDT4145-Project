package discussionForum;

import java.util.ArrayList;
import java.util.Collection;

public class Folder {

    private int folderID;
    private String name;
    private Collection<Folder> subfolders = new ArrayList<Folder>();
    private Collection<Thread> threads = new ArrayList<Thread>();

    public Folder(int folderID, String name, Collection<Folder> subfolders, Collection<Thread> threads) {
        this.folderID = folderID;
        this.name = name;
        this.subfolders = subfolders;
        this.threads = threads;
    }

    public int getFolderID() {
        return folderID;
    }
}