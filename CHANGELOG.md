# Change Log
All notable changes to this project will be documented in this file.
This project adheres to [Semantic Versioning](http://semver.org/).

## [Unreleased - soon to be 0.0.10]
### Added
- size-limit, time-limit, types-only options to search.
- controls option to search. This allows passing in arbitrary controls which have been properly instantiated via java interOp.
- respf option to search. This function, if defined, will be invoked on the list of response controls, if present.
- server-sort option to search which attaches a ServerSideSortRequestControl to the search operation.
### Replaced
- test.server has been rewritten to incorporate the InMemoryDirectoryServer provided in the UnboundID LDAP SDK.
