ModsDotGroovy.make {

    issueTrackerUrl = 'https://github.com/GroovyMC/quilt-template-mod-groovy/issues'

    mod {
        modId = this.buildProperties.mod_id
        displayName = 'Mod Name'
        displayUrl = 'https://example.com/'
        version = this.version
        group = this.group
        logoFile = 'assets/example_mod/icon.png'
        intermediate_mappings = 'net.fabric:intermediary'

        author('Your name here')

        dependencies {
            minecraft = this.minecraftVersionRange

            mod('groovyduvet') {
                versionRange = ">=${this.libs.versions.groovyduvet}"
            }

            mod('quilt_base') {
                versionRange = ">=${this.libs.versions.qsl}"
            }

            quiltLoader {
                versionRange = ">=${this.quiltLoaderVersion}"
            }
        }

        entrypoints {
            init = [
                    adapted {
                        adapter = 'groovyduvet'
                        value = 'com.example.example_mod.ExampleMod'
                    }
            ]
        }
    }
}
