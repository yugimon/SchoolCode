using UnityEngine;
using System.Collections;

public class PlayerContoller : MonoBehaviour {

	public float speed;
	
	void FixedUpdate(){
		float rotation = Input.GetAxis("Horizontal");
		rotation = (rotation * speed * Time.deltaTime);
		float moveVertical = Input.GetAxis("Vertical");

		Vector3 movement = new Vector3( 0.0f, 0.0f, moveVertical);

		transform.Rotate (0, rotation, 0);

		rigidbody.AddForce(movement * speed * Time.deltaTime);
	}
	
}