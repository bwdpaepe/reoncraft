package ReonCraft;

import org.lwjgl.opengl.Display;

import RenderEngine.DisplayManager;
import RenderEngine.MasterRenderer;

public class MainGameLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DisplayManager.createDisplay();
		MasterRenderer renderer = new MasterRenderer();
		while(!Display.isCloseRequested()) {
			renderer.prepare();
			DisplayManager.updateDisplay();
		}

	}

}
