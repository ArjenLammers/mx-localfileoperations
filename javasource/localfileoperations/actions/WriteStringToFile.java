// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package localfileoperations.actions;

import java.io.File;
import org.apache.commons.io.FileUtils;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

/**
 * Writes a String to a file, creating the file if it does not exist.
 */
public class WriteStringToFile extends CustomJavaAction<java.lang.Void>
{
	private java.lang.String file;
	private java.lang.String contents;
	private java.lang.Boolean append;

	public WriteStringToFile(IContext context, java.lang.String file, java.lang.String contents, java.lang.Boolean append)
	{
		super(context);
		this.file = file;
		this.contents = contents;
		this.append = append;
	}

	@java.lang.Override
	public java.lang.Void executeAction() throws Exception
	{
		// BEGIN USER CODE
		FileUtils.writeStringToFile(new File(file), contents, "UTF-8", append);
		return null;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 * @return a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "WriteStringToFile";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
