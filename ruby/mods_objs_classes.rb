
mystuff = {'apple' => "I AM APPLES DICTIONARY ENTRY!"} # hash (dictionary) with a key: apple
puts mystuff['apple']  # get apple from dict:  hash_name[key]

# MODULES
=begin 
  - a ruby file with some fns or vars inside a module .. end block
  - you import that file
   - you access the fns or vars in that module with the dot operator
=end

module MyStuff
	def MyStuff.apple()
		puts "I AM IN THE APPLES MODULE!!"
	end

	# this is just a var
	TANGERINE = "random tangerine variable text"
end

# use this module by "requiring it in another file and accessing its apple() method using the dot operator, like this: "
	
	# IRB::
	# require "./Mods_objs_classes.rb"
	#MyStuff.apple()  # get apple from the module: module.key
	#puts MyStuff::TANGERINE  



class MyClass
	def initialize()
		@grapefruit = "MMMm, I love grapefruits"   #@ symbol sets grapefruit as an instance variable
	end

	attr_reader :grapefruit

	def apple()
		puts "CLASSES ARE CLASSY, apples"
	end
end

# instantiate the class to get an object
thing = MyClass.new()
thing.apple()
puts thing.grapefruit


=begin
def initialize(): if you have it, the code calls that function to initialize your newly created empty object.

In the MyClass fn initialize,  @grapefruit is telling Ruby, "I want the grqpefruit var that is part of this object." 
Ruby uses operators like @ and $ do say where a variable is located. 
When you did $stdin you were saying, "the global stdin," because $ means global. 
When you do @tangerine you are saying, "the object's tangerine", because @ means "this object."

In this case, I set @grapefruit to a random string and then I've initialized this object.
Now Ruby can take this newly minted object and assign it to the thing variable for me to work with.

this is not giving you the class, but instead is using the class as a blueprint for building a copy of that type of thing.

"Instantiate" just means to create an object from the class.
=end



#Getting Things from Things
#I now have three ways to get things from things:

# dict style
mystuff['apples']

# module style
MyStuff.apples()
puts MyStuff::TANGERINE

# class style
thing = MyStuff.new()
thing.apples()
puts thing.tangerine














