puts("Please type GIZMO")

while true
  input = gets.chomp
  if input == "GIZMO"
    break				# tells Ruby to "break out of" the while loop (not the if stmt).
  end

  puts("Try typing GIZMO again!")
end

puts("THANKS FOR TYPING GIZMO")

=begin
  Normally "while true" is an infinite loop. The test will always return true, so we can't get out of the loop that way. 

  However, if the user types "GIZMO", we'll reach the break statement, which will "break us out" of the loop. We'll jump to the first line after the 2nd end.	
	
=end