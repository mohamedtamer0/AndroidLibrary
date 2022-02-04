# AndroidLibrary :
# Toast Preview Android

[![](https://jitpack.io/v/mohamedtamer0/AndroidLibrary.svg)](https://jitpack.io/#mohamedtamer0/AndroidLibrary)


> Step 1 : Add it in your root setting.gradle at the end of repositories:

```gradle
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
}
```


> Step 2 : Step 2. Add the dependency

```gradle
	dependencies {
	        implementation 'com.github.mohamedtamer0:AndroidLibrary:Tag'
	}
```
##

# 1- Add Two Button In Activity main

```Kotlin
    private lateinit var btn1:Button
    private lateinit var btn2:Button
```

# 2- Add This Code im MainActivity.kt = override fun onCreate

```Kotlin
btn1 = findViewById(R.id.btn1)
btn2 = findViewById(R.id.btn2)


btn1.setOnClickListener {
    ToastPreview.toastShort(this,"Hello Short")
}

btn2.setOnClickListener {
    ToastPreview.toastLong(this,"Hello Long")
}
```

