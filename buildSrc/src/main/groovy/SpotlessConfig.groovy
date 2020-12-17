class SpotlessConfig {

    static Closure getMisc() {
        return {
            target "**/*.md", "**/.gitignore", "**/*.gradle"

            trimTrailingWhitespace()
            indentWithSpaces(4)
            endWithNewline()

            //  Replace single quotes with double tickets
            replace "Consistent quotations", "${(char) 39}", "\""
        }
    }

    static Closure getJava(File license) {
        return {
            licenseHeaderFile license
            removeUnusedImports()
            googleJavaFormat()
            trimTrailingWhitespace()
        }
    }

    static Closure getGroovy(File license) {
        return {
            target "**/*.groovy"
            trimTrailingWhitespace()
            indentWithSpaces(4)
            endWithNewline()
        }
    }
}
