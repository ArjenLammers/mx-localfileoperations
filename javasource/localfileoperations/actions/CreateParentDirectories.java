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
 * Creates all parent directories for a File object, including any necessary but non-existent parent directories.
 */
public class CreateParentDirectories extends CustomJavaAction<java.lang.Void>
{
	private java.lang.String path;

	public CreateParentDirectories(IContext context, java.lang.String path)
	{
		super(context);
		this.path = path;
	}

	@java.lang.Override
	public java.lang.Void executeAction() throws Exception
	{
		// BEGIN USER CODE
		FileUtils.createParentDirectories(new File(path));
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
		return "CreateParentDirectories";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
