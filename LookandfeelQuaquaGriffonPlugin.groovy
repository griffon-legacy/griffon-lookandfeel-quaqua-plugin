/*
 * griffon-lookandfeel-quaqua: Quaqua Look&Feel for Griffon
 * Copyright 2010-2012 and beyond, Andres Almiray
 *
 * SmartGWT is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License version 3
 * as published by the Free Software Foundation.  SmartGWT is also
 * available under typical commercial license terms - see
 * smartclient.com/license.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 */

/**
 * @author Andres Almiray
 */
class LookandfeelQuaquaGriffonPlugin {
    // the plugin version
    String version = '0.2'
    // the version or versions of Griffon the plugin is designed for
    String griffonVersion = '0.9.5 > *'
    // the other plugins this plugin depends on
    Map dependsOn = [lookandfeel: '0.6']
    // resources that are included in plugin packaging
    List pluginIncludes = []
    // the plugin license
    String license = 'GNU LGPL 2.1'
    // Toolkit compatibility. No value means compatible with all
    // Valid values are: swing, javafx, swt, pivot, gtk
    List toolkits = ['swing']
    // Platform compatibility. No value means compatible with all
    // Valid values are:
    // linux, linux64, windows, windows64, macosx, macosx64, solaris
    List platforms = ['macosx', 'macosx64']
    // URL where documentation can be found
    String documentation = ''
    // URL where source can be found
    String source = 'https://github.com/griffon/griffon-lookandfeel-quaqua-plugin'

    List authors = [
        [
            name: 'Andres Almiray',
            email: 'aalmiray@yahoo.com'
        ]
    ]
    String title = 'Pluggable Look & Feel based on Quaqua'
    String description = '''
Pluggable Look & Feel based on [Quaqua][1].

Usage
-----

Refer to the [lookandfeel][2] plugin to find out how setup `lookAndFeel` and `theme` properties in the configuration.

LookAndFeel and Themes
----------------------
| *LookAndFeel* | *Theme* |
| ------------- | ------- |
| Quaqua        | Quaqua  |

[1]: http://randelshofer.ch/quaqua
[2]: /plugin/lookandfeel
'''
}
