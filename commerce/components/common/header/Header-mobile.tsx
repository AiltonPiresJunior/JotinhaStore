import Logo from "../Logo"; 
import ToggleDrawerButton from "./drawner-button";
import SideDrawer from "./side-Drawer";

export default function HeaderMobile(){
    // function toggleDrawer (){
    //     isDrawerOpen
    // }

    return(
        <div className="header-mobile">
            <ToggleDrawerButton openDrawer={undefined} />
            <SideDrawer closeDrawer={undefined} />
            <Logo />
            <style jsx>{`
                .header-mobile{
                    display:flex;
                    align-items: center;
                    padding: 3px 8px;
                }
            `}
            </style>
        </div>
    );
}