sliding-tab-indicator
======================

A simple sliding tab with indicator,modified base on SlidingTabLayout.

You can change default tab text color and selected text color in xml layout

Screenshots
==========

<img src="https://github.com/picksomething/sliding-tab-indicator/blob/master/screenshots_0.png" width = "200" height = "320" alt="screenshots" align=center />

Download
========

Add the latest library via Gradle:
```groovy
compile 'cn.picksomething:slidingtabindicator:1.0.0'
```
or Maven
```xml
<dependency>
  <groupId>cn.picksomething</groupId>
  <artifactId>slidingtabindicator</artifactId>
  <version>1.0.0</version>
  <type>pom</type>
</dependency>
```

Usage
=====

Add View to your layout where the viewpager is located.

Add to any layout you need to use:

```xml
<cn.picksomething.slidingtabindicator.SlidingTabLayout
        android:id="@+id/sliding_tab_layout"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="@color/sliding_tab_bg"
        android:textAlignment="center"
        app:textDefaultColor="@color/tab_text_default_color"
        app:textSelectedColor="@android:color/white"/>
``` 
- textDefaultColor:tab text defatult color
- textSelectedColor:tab text color when it is selected

If you want to change the default indicator color,just set:
```java
mSlidingTabLayout.setSelectedIndicatorColors(Color.WHITE);
```
before setViewPager for mSlidingTabLayout

License
=======

    Copyright 2017 picksomething

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
