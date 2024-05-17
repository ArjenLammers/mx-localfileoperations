# Local File Operation Actions 1.0
A wrapper around common file system actions (most come from Apache Commons IO).

## Usage
This module allows a developer to perform actions on the local file system and to read/write a file using FileDocument or as a String.
It is typically applied in on-premise situations where files are exchanged and placed on the hard drive of a server.
Also comes with an explorer to navigate the local file system.

## Installation
Download the module.
Use the actions or explorer.

## Actions
- `CleanDirectory` - Cleans a directory without deleting it.
- `CopyDirectory` - Copies a whole directory to a new location, preserving the file dates.
- `CopyFile` - Copies a file to a new location preserving the file date.
- `CreateParentDirectories` - Creates all parent directories for a File object, including any necessary but non-existent parent directories.
- `Delete` - Deletes a file or a directory recursively.
- `Exists` - Checks if a file exists.
- `FileDocumentToFile` - Writes the contents of a FileDocument to a location on the local server.
- `FileToFileDocument` - Reads the contents of a file and stores it in a FileDocument.
- `GetCurrentDirectory` - Gets the current working directory (usually where the Mendix application is deployed).
- `GetParent` - Returns the parent directory of the argument file.
- `GetSeparator`- Returns the separator of the filesystem (usually / or \\).
- `GetTempDirectoryPath` - Returns the path for storage of temporary files.
- `List` - Returns a list of File entities which are contained in the supplied path.
- `MkDir` - Creates a directory.
- `MoveDirectory` - Moves a directory.
- `MoveFile` - Moves a file.
- `ReadFileToString` - Reads the contents of a file and returns this as a String.
- `Touch` - Implements behavior similar to the UNIX "touch" utility.
- `WriteStringToFile` - Writes a String to a file.

## Limitations
- If used in a clustered setup (multi-instance) using the explorer can lead to unpredictable behavior (as client requests are - usually - distributed round robin).
- Reading a file as a String reads it fully in the memory of the application. Use with care (if sure that files are small enough)!