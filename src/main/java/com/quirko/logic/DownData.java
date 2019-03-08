package com.quirko.logic;

public final class DownData {
	
	//@ public invariant  clearRow !=null;
 	//@ public invariant  viewData !=null;
	
    private /*@ spec_public @*/  final ClearRow clearRow;
    private /*@ spec_public @*/ final ViewData viewData;

    public DownData(ClearRow clearRow, ViewData viewData) {
        this.clearRow = clearRow;
        this.viewData = viewData;
    }

    public ClearRow getClearRow() {
        return clearRow;
    }

    public ViewData getViewData() {
        return viewData;
    }
}
