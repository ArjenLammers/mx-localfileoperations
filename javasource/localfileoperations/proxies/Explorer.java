// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package localfileoperations.proxies;

public class Explorer
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject explorerMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "LocalFileOperations.Explorer";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		CurrentPath("CurrentPath"),
		TempDirectory("TempDirectory"),
		PathSeparator("PathSeparator");

		private final java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Explorer(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected Explorer(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject explorerMendixObject)
	{
		if (explorerMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, explorerMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.explorerMendixObject = explorerMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Explorer.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static localfileoperations.proxies.Explorer initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return localfileoperations.proxies.Explorer.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static localfileoperations.proxies.Explorer initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new localfileoperations.proxies.Explorer(context, mendixObject);
	}

	public static localfileoperations.proxies.Explorer load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return localfileoperations.proxies.Explorer.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of CurrentPath
	 */
	public final java.lang.String getCurrentPath()
	{
		return getCurrentPath(getContext());
	}

	/**
	 * @param context
	 * @return value of CurrentPath
	 */
	public final java.lang.String getCurrentPath(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.CurrentPath.toString());
	}

	/**
	 * Set value of CurrentPath
	 * @param currentpath
	 */
	public final void setCurrentPath(java.lang.String currentpath)
	{
		setCurrentPath(getContext(), currentpath);
	}

	/**
	 * Set value of CurrentPath
	 * @param context
	 * @param currentpath
	 */
	public final void setCurrentPath(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String currentpath)
	{
		getMendixObject().setValue(context, MemberNames.CurrentPath.toString(), currentpath);
	}

	/**
	 * @return value of TempDirectory
	 */
	public final java.lang.String getTempDirectory()
	{
		return getTempDirectory(getContext());
	}

	/**
	 * @param context
	 * @return value of TempDirectory
	 */
	public final java.lang.String getTempDirectory(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.TempDirectory.toString());
	}

	/**
	 * Set value of TempDirectory
	 * @param tempdirectory
	 */
	public final void setTempDirectory(java.lang.String tempdirectory)
	{
		setTempDirectory(getContext(), tempdirectory);
	}

	/**
	 * Set value of TempDirectory
	 * @param context
	 * @param tempdirectory
	 */
	public final void setTempDirectory(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String tempdirectory)
	{
		getMendixObject().setValue(context, MemberNames.TempDirectory.toString(), tempdirectory);
	}

	/**
	 * @return value of PathSeparator
	 */
	public final java.lang.String getPathSeparator()
	{
		return getPathSeparator(getContext());
	}

	/**
	 * @param context
	 * @return value of PathSeparator
	 */
	public final java.lang.String getPathSeparator(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.PathSeparator.toString());
	}

	/**
	 * Set value of PathSeparator
	 * @param pathseparator
	 */
	public final void setPathSeparator(java.lang.String pathseparator)
	{
		setPathSeparator(getContext(), pathseparator);
	}

	/**
	 * Set value of PathSeparator
	 * @param context
	 * @param pathseparator
	 */
	public final void setPathSeparator(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String pathseparator)
	{
		getMendixObject().setValue(context, MemberNames.PathSeparator.toString(), pathseparator);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return explorerMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final localfileoperations.proxies.Explorer that = (localfileoperations.proxies.Explorer) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return entityName;
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
