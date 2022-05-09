package engine.Objects3D;

import java.awt.Graphics;
import java.util.ArrayList;


public class ObjectHandler {
	public static ArrayList<Object3D> objectList = new ArrayList<>();

	public void tick() {
		for (int i = 0; i < objectList.size(); i++) {
			Object3D tempObj = objectList.get(i);
			tempObj.tick();
		}

	}

	public void render(Graphics g) {
		for (int i = 0; i < objectList.size(); i++) {
			Object3D tempObj = objectList.get(i);
			tempObj.render(g);
		}
	}

	public void addObject(Object3D obj) {
		objectList.add(obj);
	}

	public void remObject(Object3D obj) {
		objectList.remove(obj);
	}

}
