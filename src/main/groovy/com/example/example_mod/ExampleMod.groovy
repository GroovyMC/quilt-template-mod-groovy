package com.example.example_mod

import org.slf4j.Logger
import org.slf4j.LoggerFactory

final Logger LOGGER = LoggerFactory.getLogger("Example Mod")

// Use "arg0", "arg1", etc. to reference the different arguments of the entrypoint. (You can also use a normal old class
// entrypoint, or refer to a field in a script or class or static method in a class; entrypoints can be closures, and
// will be cast to the proper interface). If you use IntelliJ, there should be a context action to get IDE support for
// the unknown property.
LOGGER.info("Hello Quilt world from {}!", arg0.metadata().name())

