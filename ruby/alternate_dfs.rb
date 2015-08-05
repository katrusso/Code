

   
    
    $counter = nil
    $children = nil
  def read_in_graph()
    nodes_and_children = Hash.new{|hash, key| hash[key] = []}

    graphEdges = [
                    "AB",
                    "AC",
                    "BD",
                    "BE",
                    "BF",
                    "CG",
                    "GH"
                  ]

    graphEdges.each do |edge|
      nodes = edge.split("")
      nodes_and_children[nodes[0]].push nodes[1]
    end
    puts nodes_and_children
    return nodes_and_children  
  end 


  def dfs(nodes_and_children, sought)
    
    if $counter == nil #run this code once
      $counter = 1
      key, values = nodes_and_children.first
      #puts "Key: #{key}"
      #puts "Values: #{values}" 
      
      puts "Seaching Value: #{key}" 
      if key == sought
        puts "Match: #{key}"
        exit true
      end  
    else
     values = $children
    end
      
     
'''
for each value
  check to see if its a match with sought
    if yes, 
      exit true
    if no
      check to see if it has children 
        if yes, 
          recurse
        if no,
          pop it off the stack

'''
    values.each do |value| 
    puts "Seaching Value: #{value}" 
      if value == sought    
        puts "Match: #{value}"  
        exit true
      else  
        $children = nodes_and_children[value]
        #puts "children of #{value}: #{$children}"
        
        if $children.length > 0 
          dfs(nodes_and_children, sought)
        end      
      end
    end   
end
 

nodes_and_children = read_in_graph()
puts "What value are you searching for?"
sought = gets.chomp.upcase
dfs(nodes_and_children, sought)


