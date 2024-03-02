#Simple-Toast
>Step 1. Add the JitPack repository to your build file
...gradel
dependencyResolutionManagement {
		repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
		repositories {
			mavenCentral()
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency
   dependencies {
	        implementation 'com.github.DeepakDevoper:Simple-Toast:Tag'
	}
