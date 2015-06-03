#pragma strict

var goal = 20;

function Update () {
	if(transform.position.x >= goal)
	{
		transform.position = new Vector3(0.0f, 0.5f, 0.0f);
	}
	if(transform.position.x <= (goal*-1))
	{
		transform.position = new Vector3(0.0f, 0.5f, 0.0f);
	}
	
}