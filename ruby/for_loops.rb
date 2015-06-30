the_count = [1, 2, 3, 4, 5]
fruits = ['apples', 'oranges', 'grapefruit', 'cherries']
change = [1, 'pennies', 2, 'dimes', 3, 'quarters']

for number in the_count
	puts "This is count #{number}"
end


fruits.each do |fruit|
	puts "A fruit of type: #{fruit}"
end

change.each {|i| puts "I got #{i}"}

fruits.each {|fruit| puts "The fruit is #{fruit}"}


puts "-------------------"
elements = []

(0..5).each do |i|
	puts "adding #{i} to the end of the list"
	elements.push(i)
end

elements.each {|i| puts "Element: #{i}"} # print out the elements in the list
puts "-------------------"


numbers = []
(2..7).each do |i|
	puts "Adding #{i} to numbers list"
	#numbers.push(i)
	numbers << i  # is the same as numbers.push(i)
end


numbers.each do |number|
	puts number
end

puts "-------------------"

while numbers.length > 0	
	puts numbers.pop
end
