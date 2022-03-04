import './App.css';
import {Navbar} from "./components/nav-bar";
import {BrowserRouter, Routes, Route} from "react-router-dom";
import {HomePage} from "./pages/home/HomePage";
import {LoginPage} from "./pages/login/LoginPage";
import {RegisterPage} from "./pages/register/RegisterPage";
import {ProfilePage} from "./pages/profile/ProfilePage";
import {AdminPage} from "./pages/admin/LoginPage";
import {NotFoundPage} from "./pages/not-found/NotFoundPage";
import {UnAuthorizedPage} from "./pages/unauthorized/UnauthorizedPage";

function App() {
    return (
        <BrowserRouter>
            <Navbar/>
            <div className="container">
                <Routes>
                    <Route path="/" element={<HomePage/>}/>
                    <Route path="/home" element={<HomePage/>}/>
                    <Route path="/login" element={<LoginPage/>}/>
                    <Route path="/register" element={<RegisterPage/>}/>
                    <Route path="/profile" element={<ProfilePage/>}/>
                    <Route path="/admin" element={<AdminPage/>}/>
                    <Route path="/404" element={<NotFoundPage/>}/>
                    <Route path="/401" element={<UnAuthorizedPage/>}/>
                    <Route path="*" element={<NotFoundPage/>}/>
                </Routes>

            </div>
        </BrowserRouter>
    );
}

export default App;