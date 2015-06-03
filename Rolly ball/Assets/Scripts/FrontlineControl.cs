using UnityEngine;
using System.Collections;

public class FrontlineControl : MonoBehaviour {

	public float speed;
	public GameObject pole1;
	private Vector3 offset;

	void Update(){
		//transform.x = 0;
		//transform.y = 0;
		float upDown = 0.0f;
		if(Input.GetKeyDown ("down"))
		   upDown-=10.1f;
		if (Input.GetKeyDown ("up"))
		    upDown+=10.1f;


		/*if(//rotateright
		   transform.rotate(new Vector3 (10, 0, 0) * Time.deltaTime);
		if(//rotateleft
		   transform.rotate(new Vector3 (-10, 0, 0) * Time.deltaTime);*/
		
		Vector3 playerMove= new Vector3(0.0f,0.0f,upDown);
		rigidbody.AddForce(playerMove);
	}
	void Start () {
		offset = transform.position;
	}
	
	// Update is called once per frame
	void LateUpdate () {
		transform.position = pole1.transform.position + offset;
	}



}