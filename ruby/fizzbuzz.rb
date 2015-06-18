=begin 
Write a program that prints the numbers from 1 to 100. 
But for multiples of three print “Fizz” instead of the number, 
and for the multiples of five print “Buzz”. 
For numbers which are multiples of both three and five print “FizzBuzz”.


i = 1..100

i.each do |i|
	modThree = 'Fizz' if ( i % 3 ) == 0
	modFive = 'Buzz' if ( i % 5 ) == 0
	both = 'FizzBuzz' if (modThree && modFive) 
	puts output = both || modThree || modFive || i
end
=end

i = 1..100

i.each do |i|
	puts output = ('FizzBuzz' if ((( i % 3 ) == 0) && (( i % 5 ) == 0)))  || ('Fizz' if (( i % 3 ) == 0)) || ('Buzz' if (( i % 5 ) == 0)) || i
end