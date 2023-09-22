# Ronin Tenant Service REST Contracts

This repo contains the REST contracts for the [tenant service](https://github.com/projectronin/ronin-tenant-service).

# Tools

See [ronin-contract-rest-tooling](https://github.com/projectronin/ronin-gradle/blob/main/gradle-plugins/ronin-contract-openapi-plugin)
for more information about the tooling and how it works.

# Usage

## Project setup

The project looks like this:

```
├── .github                                    GitHub workflows
├── .gitignore                                 Generally applicable ignores
├── build.gradle.kts                           Gradle build script
├── settings.gradle.kts                        Gradle build settings script
└── src/main/openapi
    └── contract-rest-tenant.json               Tenant Service API spec
    └── v1/schemas                              Schema definitions used in the API spec
        └── organization.json                   Organization schema
```

## Running

In general, run:

`gradle <COMMAND> <ARGUMENTS>`

Available commands are mostly general gradle commands. Important ones are:

`check`: Verifies the contract using spectral tooling, making sure it's a valid contract.

`downloadApiDependencies`: downloads any API dependencies as specified in the `Dependencies` section above.

`build`: Runs `check`, generates schema documentation, and generates simple combined schema files.

`clean`: removes all generated files

`assemble`: Assembles the schema into deployable archives.

`publishToMavenLocal`: publishes all outputs to the local maven repo (e.g. `$HOME/.m2/repository`). If you are using the
docker image, it will try and
copy files in and out of the host's repository directory so they can be used for builds later on the host.

`publish`: publishes all outputs to the remote Ronin maven repository.
