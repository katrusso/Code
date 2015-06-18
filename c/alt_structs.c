/*
struct Owner{
	char * petsName;
	char * address;
	char * phone;
};

#define declare_Owner( name, petsName, phone ) struct Owner name = {petsName, phone}


struct Owner* new_Owner( char * petsName, char * address, char * phone)  
{
     struct Owner * obj = malloc(sizeof(struct Owner));
     if (obj) {
          obj->petsName = petsName;
          obj->address = address;
          obj ->phone = phone;
     }
     return obj;
}
*/

#include <stdio.h>
#include <stdlib.h>


//declare the fn
Object* new_Object(int id, int value); 


//create a function in the style of a constructor (object pointer return type)
Object* new_Object(int id, int value){ 
	Object* p = malloc(sizeof(Object));
	p->id = id;
	p->value = value;
	return p;
}

int main()
{
	Object* p1 = new_Object(22, 999);

	return 0;
}
