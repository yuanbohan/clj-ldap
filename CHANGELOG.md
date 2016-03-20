# Change Log
All notable changes to this project will be documented in this file.
This project adheres to [Semantic Versioning](http://semver.org/).

## [0.0.10]
### Binary (byte-array) attribute values
The behavior of the api towards binary valued attributes has been fixed. Thanks to Ray Miller for providing the 
changes to create-modification. In addition, the api now returns binary data as it was orginally submitted as opposed
to base64 encoded. Base64 encoding is only needed if the client requests a text representation of the LDAP entry, such as LDIF.

### Bind? Fix
A bug was discovered and fixed in bind? which would leave connections in the pool with an authorization ID
associated with previous BIND. Thanks to Adam Harper and Sam Umbach for debugging. The bind? function
now acts as follows:
- If passed a connection pool (which is the default behavior, connect returns a connection pool) then the BIND is
performed with a pool..bindAndRevertAuthentication which returns the autherization ID back to what it was before the BIND.
- If passed an individual LDAPConnection (which can be retrieved via (.getConnection pool), then
the BIND is performed as usual and the caller is responsible for using (..releaseAndReAuthenticateConnection pool conn)
to release the connection back to the pool.

### Added
- size-limit, time-limit, types-only options to search.
- controls option to search. This allows passing in arbitrary controls which have been properly instantiated via java interOp.
- respf option to search. This function, if defined, will be invoked on the list of response controls, if present.
- server-sort option to search which attaches a ServerSideSortRequestControl to the search operation.
- Who Am I? extended request.
- Unit tests for the above.

### Replaced
- test.server has been rewritten to incorporate the InMemoryDirectoryServer provided in the UnboundID LDAP SDK.
