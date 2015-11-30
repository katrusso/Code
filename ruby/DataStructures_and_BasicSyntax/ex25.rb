module Ex25

=begin
#MODULE VS CLASS

Modules are about providing methods that you can use across multiple classes - think about them as "libraries" (as you would see in a Rails app). 
Classes are about objects; modules are about functions.

For example, authentication and authorization systems are good examples of modules. 
Authentication systems work across multiple app-level classes 
(users are authenticated, sessions manage authentication, lots of other classes will act differently based on the auth state), 
so authentication systems act as shared APIs.

You might also use a module when you have shared methods across multiple apps (again, the library model is good here).
=end

	# Break up words.
	def Ex25.break_words(stuff)
		words = stuff.split(' ')
		return words
	end


	# Sort the words.
	def Ex25.sort_words(words)
		return words.sort 
	end


	# Print the first word
	def Ex25.print_first_word(words)
		word = words.shift
		puts word
	end


	# Print the last word
	def Ex25.print_last_word(words)
		word = words.pop
		puts word
	end


	# Takes in a full sentence and returns the sorted words
	def Ex25.sort_sentence(sentence)
		words = Ex25.break_words(sentence)
		return Ex25.sort_words(words)
	end


	# Print the first and last words of the sentence
	def Ex25.print_first_and_last(sentence)
		words = Ex25.break_words(sentence)
		Ex25.print_first_word(words)
		Ex25.print_last_word(words)
	end


	# Sort the words then print the first and last one
	def Ex25.print_first_and_last_sorted(sentence)
		words = Ex25.sort_sentence(sentence)
		Ex25.print_first_word(words)
		Ex25.print_last_word(words)
	end
end

