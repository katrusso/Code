 - Make a copy of your skeleton directory. 
 
 - Name it after your new project.
 
 - Rename (move) the lib/NAME.rb file and lib/NAME/ directory to be the name of your project or whatever you want to call your root module.

 - Edit your Gemspec to have all the information for your project.

 - Rename tests/test_NAME.rb to also have your module name.

 - Double check it's all working by using ruby tests/test_yourproject.rb again.

 - Start coding.





From Skeleton directory (to run tests):

$ rake test
# A bunch of load junk here, ignore it.
Loaded suite tests/test_NAME
Started
.
Finished in 0.000226 seconds.

1 tests, 1 assertions, 0 failures, 0 errors