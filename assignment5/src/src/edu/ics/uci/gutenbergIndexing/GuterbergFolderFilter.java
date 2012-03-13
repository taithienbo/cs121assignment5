package src.edu.ics.uci.gutenbergIndexing;

import java.io.File;
import java.io.FileFilter;

public final class GuterbergFolderFilter {

	

	// Filter out the unnecessary folders
	public static FileFilter getFilter()
	{
		FileFilter filter = new FileFilter()
		{
			public boolean accept(File file)
			{
				if(!file.getName().startsWith(NAME_TO_FILTER))
				{
					return true;
				}
				return false;
			}
		};
		
		return filter;
	
	}
	
	public static final String NAME_TO_FILTER = "ETEXT";

}
