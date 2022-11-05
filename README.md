# Quilt Template Mod Groovy

A modification of the official Quilt Template Mod to work with GroovyDuvet. You can use it as a template for your own mods!

## Usage

In order to use this mod as a template:

1. Create a new repository from this template with `Use this template`
2. Clone the recently-created repo on your PC
3. Make the necessary changes in order to make it yours:
    - Update `gradle.properties` in order to use your Maven group and mod ID
        - If you don't know which Maven group to use, and you are planning to host the mod's source code on GitHub, use `io.github.<Your_Username_Here>`
    - Update `quilt.mod.json` in order to reflect your mod's metadata
        - If you are planning to include (jar-in-jar) a mod, don't forget to declare its dependency on it!
        - The icon provided here is a placeholder one. If you aren't able to replace it yet, you can delete it and remove the "icon" property
    - Create a LICENSE file for this mod! If you don't know which license to use, check out [here](https://choosealicense.com/).
        - In `quilt.mod.json`, don't forget to put the license's [SPDX identifier](https://spdx.org/licenses/) under the `"license"` property in `"metadata"`.
        - The GPLv3 and AGPLv3 are not valid mod licenses, so you can use almost any license except for those.
    - Update the Groovy sub-directory structure so it reflects your Maven group
    - If the dependencies on `gradle/libs.versions.toml` isn't up-to-date, feel free to update them! The [linked utility](https://lambdaurora.dev/tools/import_quilt.html) should help you in this easy and quick process; check the [GroovyDuvet repo](https://github.com/GroovyMC/groovyduvet) for the newest versions of GroovyDuvet
4. The mod is now ready to be worked on!

## License

This template on the GroovyMC GitHub, as well as the original Quilt Template Mod on the QuiltMC GitHub, are licensed under the [Creative Common Zero v1.0 license](./LICENSE-TEMPLATE.md).

Mods created with this template are not automatically licensed under the CC0, and are not required to give any kind of credit back to GroovyMC or QuiltMC for this template.
