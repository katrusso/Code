# create a mapping of state to abbreviation
states = {
	'Florida' => 'FL',
	'New York' => 'NY',
	'California' => 'CA'
}

# create a mapping of cities to the states
cities = {
	'CA' => 'Palo Alto',
	'NY' => 'Albany',
	'FL' => 'Orlando'
}

# add more cities
cities['NY'] = 'New York'  # OVERWRITES ALBANY ENTRY ABOVE!

# Print cities
puts '-' * 10
puts "New York State has: #{cities['NY']}"
puts "Florida has: #{cities['FL']}"

# Print state abbrevs (values of key-value pairs)
puts "New york\'s state abbreviation is: #{states['New York']}"
puts "California\'s state abbreviation is: #{states['California']}"

# Print cities using the state table look up for the abbrev, followed by the city table look up for cities by state abbrev.
puts "California has: #{cities[states['California']]}"


puts '-' * 10


# Print every state abbrev
states.each do |state, abbrev|
	puts "#{state} is abbreviated #{abbrev}"
end


# Print every city in state
cities.each do |abbrev, city|
	puts "#{abbrev} contains the city #{city}"
end


puts '-' * 10


states.each do |state, abbrev|
	city = cities[abbrev]
	puts "#{state} is abbreviated #{abbrev} and contains the city #{city}"
end


puts '-' * 10

state = states['Texas']	# Prints nothing (nil)
puts state

if !state
	puts "Sorry, no Texas"
end



# set a default value if anticipating a nil result
city = cities['TX']
city ||= 'Does Not Exist'
puts "The city for the state of TX is: #{city}"


