package org.sikuli.slides.api.actions;

import java.util.List;

import org.sikuli.slides.api.Context;

import com.google.common.base.Objects;

public class SlideAction extends AbstractAction {
	
	@Override
	public void doExecute(Context context) throws ActionExecutionException {
		List<Action> children = getChildren();
		if (children.size() == 1){
			Action firstChild = children.get(0);
			firstChild.execute(context);
		}
	}
	
	public String toString(){
		return Objects.toStringHelper(this).add("children",getChildren()).toString();
	}
}
