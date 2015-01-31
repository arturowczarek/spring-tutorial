package info.owczarek.springtutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountersUser {
	@Autowired
	private PrototypeCounter prototypeCounter1;
	@Autowired
	private PrototypeCounter prototypeCounter2;
	@Autowired
	private SingletonCounter singletonCounter1;
	@Autowired
	private SingletonCounter singletonCounter2;

	public PrototypeCounter getPrototypeCounter1() {
		return prototypeCounter1;
	}

	public PrototypeCounter getPrototypeCounter2() {
		return prototypeCounter2;
	}

	public SingletonCounter getSingletonCounter1() {
		return singletonCounter1;
	}

	public SingletonCounter getSingletonCounter2() {
		return singletonCounter2;
	}

}
